const express = require("express");

const fileSaver = require("../controllers/fileSaver.js");

const router = express.Router();

router.get("/", (_, res) => {
  return res.status(200).json({
    success: true,
    message: "Hello, ...",
  });
});

router.post("/file-saver", fileSaver);

router.get("**", (_, res) => {
  return res.status(404).json({ success: false, message: "Route not found." });
});

module.exports = router;
