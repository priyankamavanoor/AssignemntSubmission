package com.groovy.day4.scripts

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/*Write a program to prepare a JSON string in Groovy for Bank account details like
account number,account holder name, address, phone number, email id, account balance, joined date, status, branch IFSC code
and convert this JSON string into Groovy object and display them line by line.*/

def bankObj = '{"accountNumber":"123456","accountHoldername":"Priyanka","address":"Karnataka","phone":"123456789","accountBalance":"1500","dateJoined":"12-02-2020","status":"Active","branch":"SBI","IFSCCode":"7892"}'
def jsonSlurper = new JsonSlurper()
def jsonTextAsObject = jsonSlurper.parseText(bankObj)
println bankObj


println "Convert JSON to Object"
JsonOutput jsonString = new JsonOutput()
def jsonTextAsObject1 = jsonSlurper.parseText(bankObj)
println jsonTextAsObject1
println jsonTextAsObject1.accountNumber
println jsonTextAsObject1.accountHoldername
println jsonTextAsObject1.address
println jsonTextAsObject1.phone
println jsonTextAsObject1.accountBalance
println jsonTextAsObject1.dateJoined
println jsonTextAsObject1.status
println jsonTextAsObject1.branch
println jsonTextAsObject1.IFSCCode
