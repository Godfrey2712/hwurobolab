const fs = require("fs");

const createNewDir = (dirName) => {
  if (!fs.existsSync(dirName)) {
    fs.mkdir(dirName, () => {});
  }
};

const writeNewFile = ({ dirName, fileName, file, res }) => {
  const path = `${dirName}/${fileName}`;
  try {
    fs.writeFile(path, file, (err) => {
      if (err) {

console.log(err, 'error');

        return res.status(500).json({ status: false, message: "Failure." });
      }
      return res.status(200).json({ status: true, message: "Success." });
    });
  } catch (err) {

console.log(err, 'error2');
    return res.status(500).json({ status: false, message: "Failure." });
  }
};

module.exports = { writeNewFile, createNewDir };
