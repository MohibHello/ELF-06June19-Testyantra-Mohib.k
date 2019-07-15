/* var a=10;
console.log(this);   //window
console.log(window); //window
console.log(this.a); //10
console.log(window.a);//10
console.log(this == window);//true
 */
// function checkThis() {
//     var a=10;
//     console.log(this);   //window
//     console.log(window); //window
//     console.log(this.a); //10
//     console.log(window.a);//10
//     console.log(this == window);//true
// }
// this.checkThis();

// var person = {
//     name :'john cena',
//     age :25,
//     getName:function() {
//         console.log(this);

//         function innerfunction() {
//             console.log(this);
//         }
//         innerfunction();
//     }
// };

// person.getName();


/* // Call method demonstration
var john = {
        name : 'john',
        age :25,
        presentation:function(style,message) {
            if(style=='formal') {
                console.log("hi "+this.name+' good '+message);
            }
            else {
                console.log('hey '+this.age+' '+message);
            }
        }
};
john.presentation('formal','morning');

var mike = {
        name : 'miike',
        age :25
};

john.presentation.call(mike,'friendly','buddy');
 */

/* 
//Apply demonstration pass array
var john = {
    name : 'john',
    age :25,
    presentation:function(...arr) {
        if(style=='formal') {
            console.log("hi "+this.name+' good '+message);
        }
        else {
            console.log('hey '+this.age+' '+message);
        }
    }
};
john.presentation('formal','morning');

var mike = {
    name : 'miike',
    age :25
};

john.presentation.apply(mike,['friendly','buddy']);
 */


 //bind demo (store and call )
 var john = {
    name : 'john',
    age :25,
    presentation:function(style,message) {
        if(style=='formal') {
            console.log("hi "+this.name+' good '+message);
        }
        else {
            console.log('hey '+this.age+' '+message);
        }
    }
};
// john.presentation('formal','morning');

var mike = {
    name : 'mike',
    age :25
};

var johnFormal = john.presentation.bind(mike,'formal');
johnFormal('night');

