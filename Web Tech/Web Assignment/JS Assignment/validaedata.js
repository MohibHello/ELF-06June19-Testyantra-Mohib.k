
  function checkForm(form)
  {
    // validation fails if the input is blank
    if(form.usrname.value == "") {
      alert("Error: Input is empty!");
      form.usrname.focus();
      return false;
    }

    // regular expression to match only alphanumeric characters and spaces
    var re = /^[\w ]+$/;

    // validation fails if the input doesn't match our regular expression
    if(!re.test(form.usrname.value)) {
      alert("Error: Input contains invalid characters!");
      form.usrname.focus();
      return false;
    }

    // validation was successful
    return true;
  }