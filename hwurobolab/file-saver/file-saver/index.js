require("dotenv").config();

const express = require("express");

const helmet = require("helmet");

const path = require("path");

const bodyParser = require("body-parser");

const cors = require("cors");

const corsFn = require("./utils/cors");

const PORT = process.env.PORT || 5001;

const fileSaverRoute = require("./routes");

const app = express()
  .use(helmet())

  .use(express.static(path.join(__dirname, "public")))

  .use(cors({origin:"*"}))

  .use(bodyParser.json())

  .use(express.urlencoded({ extended: false }))

  .use("", fileSaverRoute)

  .listen(PORT, () => console.log(`Listening on ${PORT}`));
