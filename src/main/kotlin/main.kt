import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    var x=0
    var pos:Float= 0.0F
    var neg:Float= 0.0F
    var neu:Float= 0.0F
    while (x<arr.size){
        if (arr[x]>0) {
            pos+=1
        } else if (arr[x]<0) {
            neg+=1
        } else {
            neu+=1
        }
        x+=1
    }
    println(pos/arr.size)
    println(neg/arr.size)
    println(neu/arr.size)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

/**
solution in python:

#!/bin/python3
import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
pos=0
neu=0
neg=0
for x in range(len(arr)):
if arr[x]>0:
pos+=1
elif arr[x]==0:
neu+=1
else:
neg+=1
print(pos/len(arr))
print(neg/len(arr))
print(neu/len(arr))


if __name__ == '__main__':
n = int(input().strip())

arr = list(map(int, input().rstrip().split()))

plusMinus(arr)

 */