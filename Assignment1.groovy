package com.groovy.scripts.day6

/*1. Write a program in groovy to take 3 inputs(2 numbers , 1 opearion option(Add,Sub,Multi,Div)) from command line and perform the operation on 2 input numbers based the operation option
For example
Scenario 1:
Input:
First number : 10
Second Number : 20
Operation Option : Add
Output:
Addition of 10 and 20 is 30
  
Scenario 2:
Input:
First number : 10
Second Number : 20
Operation Option : Multi
Output:
Multiplication of 10 and 20 is 200 */

println "Enter the value of firstNumber"
def firstNumber = System.console().readLine()

println "Enter the value of secondNumber"
def secondNumber = System.console().readLine()

println "Enter the Operation Option"
def operationOption = System.console().readLine()

def sum = firstNumber.toInteger() + secondNumber.toInteger()
println "Addition of $firstNumber and $secondNumber = "+ sum

def multi = firstNumber.toInteger() * secondNumber.toInteger()
println "Multiplication of $firstNumber and $secondNumber = "+ multi




