test("validador de cpf", () => {
  /** 
 @params cpf @type string 
 @return false ou true  @type boolean 
*/
  function isValidCPF(cpf) {
    if (typeof cpf !== "string") return false;
    cpf = cpf.replace(/[\s.-]*/gim, "");
    if (
      !cpf ||
      cpf.length != 11 ||
      cpf == "00000000000" ||
      cpf == "11111111111" ||
      cpf == "22222222222" ||
      cpf == "33333333333" ||
      cpf == "44444444444" ||
      cpf == "55555555555" ||
      cpf == "66666666666" ||
      cpf == "77777777777" ||
      cpf == "88888888888" ||
      cpf == "99999999999"
    ) {
      return false;
    }
    var soma = 0;
    var resto;
    for (var i = 1; i <= 9; i++)
      soma = soma + parseInt(cpf.substring(i - 1, i)) * (11 - i);
    resto = (soma * 10) % 11;
    if (resto == 10 || resto == 11) resto = 0;
    if (resto != parseInt(cpf.substring(9, 10))) return false;
    soma = 0;
    for (var i = 1; i <= 10; i++)
      soma = soma + parseInt(cpf.substring(i - 1, i)) * (12 - i);
    resto = (soma * 10) % 11;
    if (resto == 10 || resto == 11) resto = 0;
    if (resto != parseInt(cpf.substring(10, 11))) return false;
    return true;
  }

  expect(isValidCPF("37885788822")).toBe(true);
  expect(isValidCPF("37885788821")).toBe(false);
});

test("validador de email", () => {
  /** 
 @params email @type string 
 @return false ou true  @type boolean 
*/
  function IsEmail(pEmail) {
    const email = String(pEmail);
    const usuario = email.substring(0, email.indexOf("@"));
    const dominio = email.substring(email.indexOf("@") + 1, email.length);

    if (
      usuario.length >= 1 &&
      dominio.length >= 3 &&
      usuario.search("@") == -1 &&
      dominio.search("@") == -1 &&
      usuario.search(" ") == -1 &&
      dominio.search(" ") == -1 &&
      dominio.search(".") != -1 &&
      dominio.indexOf(".") >= 1 &&
      dominio.lastIndexOf(".") < dominio.length - 1
    ) {
      return true;
    } else {
      return false;
    }
  }

  expect(IsEmail("jadson44.santos@gmail.com")).toBe(true);
  expect(IsEmail("jadson44.santosgmail.com")).toBe(false);
});
