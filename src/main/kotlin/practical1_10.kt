fun main() {
    println("Creating car class object car1 in next line")
    var car1 = Car("Baleno", 74884, "Me", 4720, 98263)

    println("Creating car class object car1 in next line")
    var car2 = Car("Audi", 92737, "Tulsi", 492, 420000)

}

class Car constructor(carmodel: String, oprice: Int, carowner: String, mdrive: Int, carprice: Int) {
    var model: String
    var originalPrice: Int
    var owner: String
    var mileDrive: Int
    var currentPrice: Int

    init {
        this.model = carmodel
        this.originalPrice = oprice
        this.owner = carowner
        this.mileDrive = mdrive
        this.currentPrice = carprice
        println("Object has been created and init called")
        println("--------------------------------")

        println("Model : $model")
        println("Owner : $owner")
        println("Miles Drive : $mileDrive")
        println("Org Price : $originalPrice")
        println("Current Price : $currentPrice")
        println()
        println("--------------------------------\n")

    }

    fun getCarInformation() {
        println("Car's Model : $model")
    }

    fun carOwner() {
        println("Car owner : $owner")
    }

    fun mileDrove() {
        println("Miles Drive : $mileDrive")
    }

    fun getOriginalCarPrice() {
        println("Original Price : $originalPrice")
    }

    fun getCurrentCarPrice() {
        println("Current Price : $currentPrice")
    }

    fun displayCarInfo() {
        getCarInformation()
        carOwner()
        mileDrove()
        getOriginalCarPrice()
        getCurrentCarPrice()
    }


}

