class CharacterController {
    val repository = CharacterRepository
    fun write(num:Int){
        repository.writeCharacter(num)
    }

    fun read(i: Int) {
        repository.readCharacter(i)
    }

    fun attack(i: Int) {
        repository.attack(i)
    }
}