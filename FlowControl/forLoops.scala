// for (item <- List(1,2,3)){
//   println(item);
// }

// for (item <- Array.range(0,5)){
//   println(item);
// }

for (num <- Range(1,10)){
  if(num%2 == 0){
    println(s"$num es par")
  }else{
    println(s"$num es inpar")
  }
}
