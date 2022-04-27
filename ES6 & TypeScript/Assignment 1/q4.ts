<<<<<<< HEAD
let names = ["Tom", "Ivan", "Jerry"];
var arrowFunction = (StringArray)=>{
    let resArray=[];
    StringArray.map((ele)=>{
    let object={
        name:"",
        length:0
    };
    object.name=ele;
    object.length= ele.length;
    resArray.push(object);
    })
    return resArray;
 }
 document.write(JSON.stringify(arrowFunction(names)));
=======
let names = ["Tom", "Ivan", "Jerry"];
let objects = [];
var object = function(name:string) {
    this.name = name,
    this.length = name.length
}

for (let i of names){
    var object1 = new object(i);
    objects.push(JSON.stringify(object1));
}


document.write(objects);
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
