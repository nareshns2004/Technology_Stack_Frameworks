//Write a program that prints all the male people’s first name given a complex object

  var Person =[ {
    firstName : "Naresh",
    lastName : "Kumar"
  }, {
    firstName : "Ashish",
    lastName : "Kumar"
  },
  {
    firstName : "Programmer",
    lastName : "America"
  }
];

for(var i=0;i<Person.length;i++)
{
    console.log(Person[i]["firstName"]);
}
