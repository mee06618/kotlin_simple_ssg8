open class Weapon(var name: String ="x",var weaponDam: Int =0 ) {

    open fun attack(): Weapon? {


        return null
    }

}

class Stick():Weapon("지팡이",2){

    override fun attack(): Weapon {
        return Weapon(this.name,this.weaponDam)
    }
}
class Axe():Weapon( "도끼",5){

    override fun attack(): Weapon {
        return Weapon(this.name,this.weaponDam)
    }
}
class Sword():Weapon("검",10){

    override fun attack(): Weapon {
        return Weapon(this.name,this.weaponDam)
    }
}
