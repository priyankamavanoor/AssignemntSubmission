package com.groovy.scripts.day6

/*Define a closures to check if a string is palindrome and if yes then display the entered string in upper case else in lowercase
For Example:
Inout String is "dad" , output : DAD // as dad is palindrome
Inout String is "Hello" , output : hello // as hello is not a palindrome */



String name = "hello"
String reverseName = ""
        int length = name.length()

        for(int i = length - 1; i >= 0; i --) {
            reverseName = reverseName + name.charAt(i)
        }
        if (name.equals(reverseName)) {
			println name.toUpperCase()
            println "HELLO is Palindrome"
        } else {
            println "hello is NOT a Palindrome"
        }