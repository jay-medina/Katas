var fs = require('fs');
var filename = process.argv[2];

if(filename === undefined){
  console.log('Please provide a filename');
  return;
}

fs.stat(filename, function(err, stats) {
  if(err) {
    console.log("There doesn't exist a file named:", filename);
    return;
  }

  console.log("Size of the file is ", stats.size, " bytes.");
  console.log("Or ", stats.size / 1000.0, " kilobytes");
});
