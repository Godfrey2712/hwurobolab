const postData = async ({ file, fileName }) => {
  fetch("http://localhost:5001/file-saver", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      file,
      type,
    }),
  })
    .then((res) => console.log(res, "response"))
    .catch((err) => console.log(err, "error"));
};
