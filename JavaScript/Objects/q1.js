<<<<<<< HEAD
function person(fname,lname,age,skills,dateofbirth,address,married,profession)
 {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;

 }
var person1=new
person("nikhil","goud",22,"c","24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
var person2=new person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jr analyst")

var print=function()
{
 document.write(JSON.stringify(person1));
 document.write(JSON.stringify(person2));
=======
function person(fname,lname,age,skills,dateofbirth,address,married,profession)
 {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;

 }
var person1=new
person("nikhil","goud",22,"c","24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
var person2=new person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jr analyst")

var print=function()
{
 document.write(JSON.stringify(person1));
 document.write(JSON.stringify(person2));
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
}();