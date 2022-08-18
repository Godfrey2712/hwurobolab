const { createNewDir, writeNewFile } = require("../helpers");

const dirName = "downloads";

const saveFile = (req, res) => {
  const file = req.body.file;

  const fileName = req.body.fileName;

 console.log(fileName, 'file name', file, 'file')

  createNewDir(dirName);

  writeNewFile({ fileName, dirName, file, res });
};

module.exports = saveFile;

