package com.groovy.scripts.day6

/*Merge 3 lists of string data in Groovy and display the counter for each element in the merged list
For example :
list1 = ["Hari","Francis","Naveen"]
list2 = ["Harish","Thejus","Naveen", "Partha"]
list3 = ["Hari","Thejus","Pritika","Subha"]
Output: Hari => 2, Francis => 1, Naveen => 2, Harish => 1, Thejus => 2, Pritika => 1, Subha => 1, Partha => 1 */

def list1 = ["Hari","Francis","Naveen"]
def list2 = ["Harish","Thejus","Naveen", "Partha"]
def list3 = ["Hari","Thejus","Pritika","Subha"]

println ([list1, list2, list3].transpose().collect{it -> it[0] + it[1]})
