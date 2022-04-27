<<<<<<< HEAD
let array1 = ["red","blue","green","black"];

let [ , ,colour,]=array1;
document.write(colour+"<br>");

let details = {
    name7 : "naga",
    address : {
        street : "Balaji nagar",
        city : "kurnool",
        state : "AP",
        pincode : 518006
    }
}

let {name7,address} = details;

document.write(name7+"<br>");
=======
let array1 = ["red","blue","green","black"];

let [ , ,colour,]=array1;
document.write(colour+"<br>");

let details = {
    name7 : "naga",
    address : {
        street : "Balaji nagar",
        city : "kurnool",
        state : "AP",
        pincode : 518006
    }
}

let {name7,address} = details;

document.write(name7+"<br>");
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write(address.pincode);