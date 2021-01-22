var profileSave = [
  (mattseo = {
    id: '19851031',
    firstName: 'Matt',
    lastName: 'Seo',
  }),
];

console.log('profileSave', profileSave);

var profilecheck = function () {
  console.log('First Name', this.firstName);
};

// console.log('mattseo', mattseo);

// profilecheck.call(mattseo);

var idNumber = 'matt';
var searchedName;
for (let i = 0; i < profileSave.length; i++) {
  if (
    profileSave[i].firstName.toLocaleLowerCase() ===
    idNumber.toLocaleLowerCase()
  ) {
    searchedName = profileSave[i];
  }
}

profilecheck.call(searchedName);
