//Q1
class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    //Q2 
    getArea = () => { return this.width * this.height; };
    getPerimeter = () => { return 2 * (this.width + this.height); };
  }
  r = new Rectangle(2, 3);
  document.write(`Rectangle r width is ${r.width}, length is ${r.height} <br> `);
  document.write(`rectangle r of length ${r.length} & width  ${r.width} has area ${r.getArea()} and perimeter ${r.getPerimeter()}<br>`);
  
  //Q3 
  s = new Rectangle(4,10);
  document.write(`New rectangle s of length ${s.length} & width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}<br>`);
  s.width = 5;
  document.write(`rectangle s of length ${s.length} & Changed width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}<br>`);
  
  //Q4 
  var myObject = {firstname: "Golla",lastname: "Mani ",age: "21 ",city: "Kurnool ",state: "AP ",country: "India"};
  document.write(`First-name is ${myObject.firstname} , lastname  is ${myObject.lastname} , age is ${myObject.age} , city is ${myObject.city} , state is ${myObject.state} , country is ${myObject.country}<br>`);
  myObject.lastname = "Manindra  ";
  document.write(`Changed Lastname ${myObject.lastname}<br>`);
  //Q5 
  document.write(`since there is no middle name defined The middle name is : ${myObject.MiddleName}<br>`);
  myObject.MiddleName = "Naga  ";
  document.write(`After defining The middle name is : ${myObject.MiddleName}<br>`);
  
  //Q6 
  var string = "{firstName:'Naga', age:21, city:'Kurnool', state:'AP', country:'India'}";
  eval('var obj='+string);
  document.write(JSON.stringify(obj)+"<br>");
  myObject.MiddleName = "Manindra ";
  document.write(` The middle name is : ${myObject.MiddleName}<br>`);
  
  //Q7 
  var obj = '{ "firstName":"Naga", "lastName":"Manindra " }';
  obj = JSON.parse(obj); //converts to a regular object
  document.write(JSON.stringify(obj)); //John