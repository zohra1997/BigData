package ca.jrvs

object App{
 def foo(x:Array[String])=x.foldLeft("")((a,b)=>a+b)
def main (args: Array[String]){
println("Hello world!")
println("concat arguments= " +foo(args))
}

}

