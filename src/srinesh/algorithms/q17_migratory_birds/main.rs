use std::cmp::Ordering::*;
use std::collections::HashMap;
use std::env;
use std::fs::File;
use std::io::{self, BufRead, Write};

/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fn migratoryBirds(arr: &[i32]) -> i32 {
    arr.iter()
        .fold(HashMap::<i32, i32>::new(), |mut acc, &v| {
            *acc.entry(v).or_default() += 1;
            acc
        })
        .into_iter()
        .max_by(|e1, e2| {
            if e1.1 > e2.1 {
                Greater
            } else if e1.1 < e2.1 {
                Less
            } else if e1.0 < e2.0 {
                Greater
            } else {
                Less
            }
        })
        .expect("")
        .0
}

fn main() {
    let stdin = io::stdin();
    let mut stdin_iterator = stdin.lock().lines();

    let mut fptr = File::create(env::var("OUTPUT_PATH").unwrap()).unwrap();

    let _arr_count = stdin_iterator
        .next()
        .unwrap()
        .unwrap()
        .trim()
        .parse::<i32>()
        .unwrap();

    let arr: Vec<i32> = stdin_iterator
        .next()
        .unwrap()
        .unwrap()
        .trim_end()
        .split(' ')
        .map(|s| s.to_string().parse::<i32>().unwrap())
        .collect();

    let result = migratoryBirds(&arr);

    writeln!(&mut fptr, "{}", result).ok();
}
