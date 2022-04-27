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