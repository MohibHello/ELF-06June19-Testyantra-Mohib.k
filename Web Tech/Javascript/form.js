window.onload = function() {
    

}

function validateForm() {
    let myEmail = document.forms[0].email.value;
    let myPwd = document.forms[0].password.value;
    let myCnfPwd = document.forms[0].confirmpassword.value;
    //console.log(myEmail);

    if(myEmail.length >= 6) {

        if(myPwd.length>=6 && myPwd == myCnfPwd) {
            document.forms[0].myButton.disabled = false;
            document.getElementById('msg1').innerHTML = '';

        } else {
            document.forms[0].myButton.disabled = true;
            document.getElementById('msg1').innerHTML = 'pwd not matching';
        }

    } else {
        document.forms[0].myButton.disabled = true;
    }
}

/* var x = prompt("Enter the number");
function factorial(x) 
{ 

  if (x === 0)
 {
    return 1;
 } else{
    return x * factorial(x-1);
 }
         
}
alert(`Factorial is `+factorial(x)); */


function counter(){
    var counter = 0;

    function getCount(){
        counter++;
        return counter;
    }
    return getCount;
}

let count = counter();
var value = count();

console.log(value);
var value1 = count();
console.log(value1);
var value2 = count();
console.log(value2);
var value3 = count();
console.log(value3);

var dwightSalary = (function() {
    var salary = 60000;
    function changeBy(amount){
        salary += amount;
    }

    return {
        raise: function(){
            changeBy(5000);
        },
        lower: function() {
            changeBy(-5000);
        },
        currentamount: function() {
            return salary;
        }
    };
})();

console.log(dwightSalary.currentamount());
dwightSalary.lower();
console.log(dwightSalary.currentamount());
dwightSalary.raise();
console.log(dwightSalary.currentamount());
//dwightSalary.changeBy(10000); // error when called


let promise = new Promise((res,rej)=>{
    const items = [{id:1,name:'Mohib'},{id:2,name:'Santosh'},{id:3,name:'Ashutosh'}];
    if(items.length > 0){
        res(items);
    } else {
        rej("rejected");
    }
});

let promise2 = new Promise((res,rej)=>{
    const items = [{id:1,name:'Mohib'},{id:2,name:'Santosh'},{id:3,name:'Ashutosh'}];
    if(items.length > 0){
        res(items);
    } else {
        rej("rejected");
    }
});

let promise3 = new Promise((res,rej)=>{
    const items = [{id:1,name:'Mohib'},{id:2,name:'Santosh'},{id:3,name:'Ashutosh'}];
    if(items.length > 0){
        res(items);
    } else {
        rej("rejected");
    }
});

Promise.all([promise,promise2,promise3]).then((data)=>{
    var data;
    console.log(data);
});

promise.then((data)=>{
    console.log(data);
}).catch((reason)=>{
    console.log(reason);
});


