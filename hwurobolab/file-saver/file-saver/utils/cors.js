const { REMOTE_BASEURL, DEV_BASEURL } = process.env;

const allowedOriginsDev = ["http://localhost:1999"];

const allowedOriginsProd = [REMOTE_BASEURL, "*"];

const origins =
  process.env.NODE_ENV === "production"
    ? allowedOriginsProd
    : allowedOriginsDev;

const corsFn = (req, cb) => {
  let corsOption;

  const isDomainAllowed = origins.indexOf(req.header("Origin")) !== -1;

  if (isDomainAllowed) corsOption = { origin: true };
  else corsOption = { origin: false };

  cb(null, corsOption);
};

module.exports = corsFn;
