<<<<<<< HEAD
interface Printable {
    radius? : number;
    eid? : number;
    ename? : string;
    edesignatio? : string;
}
let Circle:Printable =(function () {
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.print = function () {
        return "The radius of Circle is " + this.radius + "<br>Area is " + (Math.PI * this.radius * this.radius);
    };
    return Circle;
}());
let Employee:Printable =(function () {
    function Employee(ename, eid, edesignatio) {
        this.eid = eid;
        this.ename = ename;
        this.edesignatio = edesignatio;
    }
    Employee.prototype.print = function () {
        return "Employee Details:<br>" + "Employee Id:" + this.eid + "<br>" + "Employee Name: " + this.ename
            + "<br>" + "Employee Designation: " + this.edesignatio;
    };
    return Employee;
}());
function printAll(obj1, obj2) {
    document.write(obj1.print()+"<br><br>");
    document.write(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("Manindra", 123, "jr analyst");
=======
interface Printable {
    radius? : number;
    eid? : number;
    ename? : string;
    edesignatio? : string;
}
let Circle:Printable =(function () {
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.print = function () {
        return "The radius of Circle is " + this.radius + "<br>Area is " + (Math.PI * this.radius * this.radius);
    };
    return Circle;
}());
let Employee:Printable =(function () {
    function Employee(ename, eid, edesignatio) {
        this.eid = eid;
        this.ename = ename;
        this.edesignatio = edesignatio;
    }
    Employee.prototype.print = function () {
        return "Employee Details:<br>" + "Employee Id:" + this.eid + "<br>" + "Employee Name: " + this.ename
            + "<br>" + "Employee Designation: " + this.edesignatio;
    };
    return Employee;
}());
function printAll(obj1, obj2) {
    document.write(obj1.print()+"<br><br>");
    document.write(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("Manindra", 123, "jr analyst");
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
printAll(circleObj, employeeObj);