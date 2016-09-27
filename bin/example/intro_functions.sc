package example

object intro_functions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  object Dog {
  	def apply() = println("wooof!")
  }
  
  Dog()                                           //> wooof!
  
  case class Dog(val name:String) {
  	def apply() = {
  		println(name + "arf!")
  	}
  }
  	
  val d1 = new Dog("fido")                        //> d1  : example.intro_functions.Dog = Dog(fido)
  val d2 = new Dog("spot")                        //> d2  : example.intro_functions.Dog = Dog(spot)
  	
  d1()                                            //> fidoarf!
  
  def matchDog(d:Dog) = d match {
  	case Dog("fido") => println("Here is fido!")
  	case _ => "fido was not found"
  }                                               //> matchDog: (d: example.intro_functions.Dog)Any
  
  matchDog(d1)                                    //> Here is fido!
                                                  //| res0: Any = ()
  
  
}