/* let name = document.getElementById('name');
console.log(name);
console.log(name.textContent);
name.style.color = "darkblue";

var classCollection = document.getElementsByClassName('demo');
console.log(classCollection);
classCollection[0].style.fontSize = '100px';   
//classCollection[1].style.visibility = 'hidden';
classCollection[1].style.display = 'false';
    

//document.getElementById('myButton').className = 'button';
document.getElementById('myButton').classList = 'button1 button';

//var querySelector = document.querySelector('p');
var querySelector = document.querySelectorAll('.demo');

console.log(querySelector);

let input = document.createElement('input');
document.body.appendChild(input);


var demoClass = document.getElementsByClassName('demo');
var demoClass1 = document.querySelectorAll('.demo');

console.log("number of elements with querySelector = "+ demoClass1.length);
console.log("number of elements with class name = "+ demoClass.length);

document.getElementById("pele").className = "blue";

console.log("number of elements with querySelector = "+ demoClass1.length);
console.log("number of elements with class name = "+ demoClass.length);


document.write("<input id='a' name='abc' value='auto'></input>");
 */
/*
let button1 = document.getElementById('myButton');
button1.onclick = function createNewElement() {
    document.getElementById('div1').innerHTML = '<a href="https://www.google.com"> Anchor Tag</a>';
};

*/
let abc =  document.getElementById('myButton1');

abc.click = function xyz() {
    document.getElementById('a1').type = 'text';
}

window.onload = function() {
    document.getElementById('myButton1').textContent = 'Dont Click';
    document.getElementById('myButton1').disabled = 'true';
}


let button1 = document.getElementById('myButton');
button1.addEventListener('click', () => {
    document.getElementById('div1').innerHTML = '<a href="https://www.google.com"> Anchor Tag</a>';
});