package com.groovy.day3.scripts;


def filePath = "C:\\Users\\Administrator\\eclipse-workspace\\groovy\\Groovy_Training_Day3\\src\\com\\groovy\\day3\\scripts\\data\\StudentDataFile"
File fileObj = new File(filePath)

println fileObj.text

def studentToBeSearched = "dad"
fileObj.eachLine {
	line,index ->
	 if(studentToBeSearched.equalsIgnoreCase(line)) {
		 println "$line, $index"
		 println "DAD is Palindrome"
	}
}