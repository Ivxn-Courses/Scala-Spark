var x = "Hello"
var ini = "H"
var end = "A"
if(x.endsWith(end)){
  printf("%s ends with %s", x, end)
}else if(x.startsWith(ini)){
  printf("%s starts with %s", x, ini)
}else{
  printf("the value does not start with %s and it does not end with %s",ini,end)
}
