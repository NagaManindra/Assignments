<<<<<<< HEAD
"use strict";
let names = ["Tom", "Ivan", "Jerry"];
var arrowFunction = (StringArray) => {
    let resArray = [];
    StringArray.map((ele) => {
        let object = {
            name: "",
            length: 0
        };
        object.name = ele;
        object.length = ele.length;
        resArray.push(object);
    });
    return resArray;
};
document.write(JSON.stringify(arrowFunction(names)));
=======
"use strict";
let names = ["Tom", "Ivan", "Jerry"];
var arrowFunction = (StringArray) => {
    let resArray = [];
    StringArray.map((ele) => {
        let object = {
            name: "",
            length: 0
        };
        object.name = ele;
        object.length = ele.length;
        resArray.push(object);
    });
    return resArray;
};
document.write(JSON.stringify(arrowFunction(names)));
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
//# sourceMappingURL=q4.js.map