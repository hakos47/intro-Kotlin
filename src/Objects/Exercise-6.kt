package Objects

import Objects.Exercise6.BirdInterface
import Objects.Exercise6.DogInterface
import Objects.Exercise6.WhaleInterface
import Objects.Exercise6.Dog
import Objects.Exercise6.Bird
import Objects.Exercise6.Whale

fun exercise6() {
    val dog: DogInterface = Dog(name = "Max", breed = "Labrador")
    println(dog.makeSound())
    println(dog.wagTail())

    val bird: BirdInterface = Bird(name = "Tweety", wingSpan = 0.25)
    println(bird.makeSound())
    println(bird.fly())

    val whale: WhaleInterface = Whale(name = "Willy", size = 25.0)
    println(whale.makeSound())
    println(whale.swim())

}