//
// This is only a SKELETON file for the "Leap" exercise. It's been provided as a
// convenience to get you started writing code faster.
//

var Year = function(input) {
//
// YOUR CODE GOES HERE
  this.year = input;
//  
};

Year.prototype.isLeap = function() {
//
// YOUR CODE GOES HERE
  // return (((this.year % 4) === 0) && ((this.year % 100) !== 0)) || ((this.year % 400) === 0);
  // That's BORING ^ let's do something more fun.
  const thisYear = new Date(this.year, 1, 29);
  return thisYear.getMonth() !== 2;
//
};

module.exports = Year;
