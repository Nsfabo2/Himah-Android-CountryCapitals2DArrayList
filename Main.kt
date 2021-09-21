
fun main(){
/**/

    //Create an ArrayList of ArrayLists containing two strings (country and capital)
    val Countries_2D_List = ArrayList<ArrayList<String>>()
    //Create a string variable to hold a country and a string variable to hold a capital
    var country: String
    var capital: String

    println("Would you give us a country and capital, please?")
//After the user has entered 3 pairs,
for (i in 0..2){
    //Ask the user to enter a country and capital,
    print("Country: ")
    country = readLine()!!.toString()
    print("Capital: ")
    capital = readLine()!!.toString()
    //then add the pair to the 2d ArrayList
    Countries_2D_List.add(arrayListOf(country,capital))
}
for (i in Countries_2D_List){
    // print each country and its capital
    println("${i[0]}'s capital is  ${i[1]}")
}

}
