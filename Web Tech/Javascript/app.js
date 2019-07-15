// var a=10;
// console.log(a);
// var b=a;
// console.log(b);
// b=20;
// console.log(a);
// console.log(b);
// console.log("======");



var person = {
    name: 'rahul',
    age: 34,
    lastname: 'bhai',
    gender: 'male',
    getName: function getName() {
        return this.name + " " + this.lastname;
    },
    address: {
        city: 'Banglore',
        state: 'karnataka',
        pincode: 560068
    },
    hobbies: ['sleeping', 'oversleeping', 'travelling']
};
// console.log("city  :"+person.address.city);
// console.log("full name  : "+person.getName());

// console.log("hobbies  : "+person.hobbies[0]+" "+person.hobbies[1]+" "+person.hobbies[2]);

var library = [
    {
        id: 1,
        author: 'bill gates',
        name: 'computer'

    },
    {
        id: 2,
        author: 'steve jobs',
        name: 'apple'
    }];
// console.log(library[0]);


// var date =new Date();
// console.log(date);

// var date1 =new Date(2018,11,11,10,23,23,0);
// console.log(date1);

// var date2 =new Date(5);
// console.log(date2);


var hobbies = ['cricket', 'volleyball', 'football', 'hockey'];
//document.getElementById('demo').innerHTML = hobbies;

// console.log("name ="+person.name); //rahul
// var person1=person;
// console.log("p1 name="+person1.name); //rahul
// person1.name = 'rocky';
//console.log("P nmae ="+person1.name);//rocky

var address = {
    city: 'Banglore',
    state: 'karnataka',
    pincode: 560068
};

// for (var i = 0; i < address.length; i++) {
//     console.log("print this" + address[i]);
// }

// hobbies.forEach((val, index) => {
//     console.log("value" + val);
//     console.log("index" + index);
// });


// console.log("========");

// for (const index in hobbies) {
//     console.log("hobbies==" + hobbies[index]);
// }

// console.log("=------------=");

// for (const index in person) {
//     console.log("person==" + person[index]);
// }
// console.time("forof");
// for (var i of hobbies) {
//     var a=[];
// }


// console.timeEnd("forof");
// console.log("for of ended")


// function alertMessage() {
//     alert("this is named function");
// }

// (function(){
//     alert("this is IIfe");
// }());

// function alertMesage(val,number) {
//     alert(`This is named function value = ${val} number= ${number}`);
// }


// alertMesage("hello",23);

varKey();

function varKey() {
    a=20;
    console.log("a : "+a);
}
// function varKey() {
//     let b=20;
//     console.log("b"+b);
// }
// console.log(b);

// function varKey() {
//     const c=20;
//     console.log("c"+c);
// }
// console.log(c);

// varKey();

// fnname();
// function fnname() {
//     console.log("aaaa");
// }

// var fnname1 = function() {
//     console.log("bbb");
// }
// fnname1;

/* hobbies.push("kaaababa");
console.log(hobbies);


hobbies.pop();
console.log(hobbies);


hobbies.pop();
console.log(hobbies);



var incl=hobbies.includes("rocky");
console.log(incl); */


/* 
hobbies.splice(0,0,"gggg");
console.log(hobbies.join("----"));

 let hobbies1 = hobbies.slice(0,1);
console.log(hobbies1); 

console.log(hobbies.indexOf('pogo')); */


//callback function

/* function first(sec) {
    setTimeout(()=>{
    console.log("this is first");
    sec();
},0);
}
function second() {
    console.log("this is second");
}

first(second); */

const item =[
    {
        id:1,
        name:'book',
        price:200
    },
    {
        id:2,
        name:'Redbook',
        price:400
    },
    {
        id:3,
        name:'Bluebook',
        price:300
    },
    {
        id:4,
        name:'greenbook',
        price:550
    }
];
/* let mappedIds = item.map((value)=>{
    return value.price;
}
);

console.log(mappedIds); */

let filteredValue = item.filter((value)=>{
    return value.name==='Bluebook';
}
);

console.log(filteredValue);