import java.util.*

object CharacterRepository {
    val characters = mutableListOf<Character>()
    var lastNum=0
    fun writeCharacter(num:Int) {
        val temp= mutableListOf<List<String>>()
        val temp2= mutableListOf<List<String>>()
        for(i in 0 until num) {

            val arr = readLine()!!.split(" ")
            temp.add(arr)

        }
        for(i in 0 until num) {

            val arr2 = readLine()!!.split(",")
            temp2.add(arr2)
        }

        for(i in 0 until num) {
            characters.add(Character(++lastNum,temp[i][0],temp[i][1],temp[i][2],temp2[i][0].toInt(),temp2[i][1].toInt(),temp2[i][2].toInt()))
        }



        }


    fun readCharacter(i: Int) {
        println("num : ${characters[i].num}")
        println("name : ${characters[i].name}")
        println("job : ${characters[i].job}")
        println("birth : ${characters[i].birth} years")
        println("age : ${getAge(characters[i].birth)} years old")
        println("str : ${characters[i].str}")
        println("int : ${characters[i].intel}")
        println("dex : ${characters[i].dex}")
    }
    fun attack(num: Int) {
        for(i in 0 until num) {
            var temp= Weapon()
            if(characters[i].job=="의적") {
                temp = Sword().attack()
            }else if(characters[i].job=="도적") {
                temp = Axe().attack()
            }else if(characters[i].job=="상인") {
                temp = Stick().attack()
            }

            println("직업이 ${characters[i].job}인 ${characters[i].name}(이)가 ${temp.name}(으)로 공격합니다.")
            println("무기공격력 : ${temp.weaponDam}")
            println("데미지 : ${characters[i].str * characters[i].dex * temp.weaponDam}")
        }
    }
    fun getAge(birth:String):Int{
        val changedBirth=birth.split("년")
        val instance = Calendar.getInstance()
        val year = instance.get(Calendar.YEAR).toInt()

        return year-changedBirth[0].toInt()
    }


}

