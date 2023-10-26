var s = "This is a sunny day";
const s1 = s.split(' ');
var x=''
for (let i = 0; i < s1.length; i++) {
    for (let j = s1[i].length - 1; j >= 0; j--) {
         x=x+s1[i].charAt(j);
    }
    x=x+' '
}
console.log(x)