object tutorial6 {
    def main(args: Array[String])={
        args(0) match{
            case "q1" =>    
                            {
                                // Question 01
                                def encrypt(x:String,y:Int):String = x.length() match{
                                    case 0 => ""
                                    case _ if(x.head <= 'Z' && x.head >= 'A') => (65 + (x.head.toUpper.toChar.toInt+y-65)%26).toChar + encrypt(x.tail,y)
                                    case _ => x.head + encrypt(x.tail,y)
                                }
                                def decrypt(x:String,y:Int):String = x.length() match{
                                    case 0 => ""
                                    case _ if(x.head <= 'Z' && x.head >= 'A') => (65 + (x.head.toUpper.toChar.toInt+26-y-65)%26).toChar + decrypt(x.tail,y)
                                    case _ => x.head + decrypt(x.tail,y)
                                }
                                
                                var input = scala.io.StdIn.readLine("\nEnter a string to encrypt: ")
                                print("Enter a key: ")
                                var key = scala.io.StdIn.readInt()
                                print(encrypt(input,key))
                                
                                input = scala.io.StdIn.readLine("\nEnter a string to decrypt: ")
                                print("Enter a key: ")
                                key = scala.io.StdIn.readInt()
                                print(decrypt(input,key))
                            }


            case "q2" =>    
                            {// Question 02

                                def encrypt(x:String,y:Int):String = x.length() match{
                                    case 0 => ""
                                    case _ if(x.head <= 'Z' && x.head >= 'A') => (65 + (x.head.toUpper.toChar.toInt+y-65)%26).toChar + encrypt(x.tail,y)
                                    case _ => x.head + encrypt(x.tail,y)
                                }
                                def decrypt(x:String,y:Int):String = x.length() match{
                                    case 0 => ""
                                    case _ if(x.head <= 'Z' && x.head >= 'A') => (65 + (x.head.toUpper.toChar.toInt+26-y-65)%26).toChar + decrypt(x.tail,y)
                                    case _ => x.head + decrypt(x.tail,y)
                                }

                                def cipher(x:String,key:Int, func: (String,Int)=>String):String = {
                                    func(x,key)
                                }

                                println("\n\t\tEnter the string and a key")
                                println("\t\t1 for encrypt")
                                println("\t\t2 for decrypt\n")
                                var input = scala.io.StdIn.readLine("Enter a string: ")
                                print("Enter a key: ")
                                var key = scala.io.StdIn.readInt()
                                print("Enter the option: ")
                                var opt = scala.io.StdIn.readInt()
                                opt match{
                                    case 1 => println(cipher(input,key,encrypt))
                                    case 2 => println(cipher(input,key,decrypt))
                                } 
                            }
        }
    }
}
