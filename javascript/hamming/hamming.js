var Hamming = function() {};

const computeDistance = (firstStrand, secondStrand) => {
  const secondStrandArray = secondStrand.split('');
  return firstStrand.split('').reduce(
    (distance, value, index) => ((value !== secondStrandArray[index]) + distance),
    0
  );
}

Hamming.prototype.compute = (firstStrand, secondStrand) => {
  if (firstStrand.length === secondStrand.length) {
    return computeDistance(firstStrand, secondStrand);
  } else {
    throw new Error('DNA strands must be of equal length.');
  }
};

module.exports = Hamming;
