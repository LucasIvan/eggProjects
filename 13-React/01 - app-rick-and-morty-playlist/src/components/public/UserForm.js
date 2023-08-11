import React, { useEffect, useState } from 'react'
import { useUserForm } from './../../hooks/Custom.hooks';

const UserForm = () => {

  const { form, setForm, handleChanges } = useUserForm();
  const [areEquals, setAreEquals] = useState(true)
  const [passwordConfirmation, setPasswordConfirmation] = useState(true)
  const [pass, setPass] = useState(true)

  const validPass = () => {
    const { password } = form;
    if (password !== undefined) {
      setPass(false)
    }
    return pass
  }

  const handlePasswordConfirmation = (event) => {
    setPasswordConfirmation(event.target.value);
  }

  useEffect(() => {
    const { password } = form;
    setAreEquals(password === passwordConfirmation);
    validPass()
  }, [passwordConfirmation, pass])

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(form);
  }

  return (
    <div className="w-25 mx-auto mt-5">
      <h4 className="mb-3">Humano Registrate!</h4>
      <form className="needs-validation" noValidate>
        <div className="row g-3">
          <div className="col-12">
            <label htmlFor="email" className="form-label">
              Email
            </label>
            <input type="email" className="form-control" id="email" placeholder="you@example.com" name="email" onChange={handleChanges} />
            <div className="invalid-feedback">
              Please enter a valid email address for shipping updates.
            </div>
          </div>

          <div className="col-12">
            <label htmlFor="address" className="form-label">
              Clave
            </label>
            <input type="password" className="form-control" id="address" placeholder="Clave" name="password" onChange={handleChanges} required />
            <div className="invalid-feedback">
              Please enter your shipping address.
            </div>
          </div>

          <div className="col-12">
            <label htmlFor="password2" className="form-label">
              Repetir Clave
            </label>
            <input type="password" className="form-control" id="password2" placeholder="Repetir clave" onChange={handlePasswordConfirmation} />
            {!areEquals && (
              <div className="form-text list-group-item-danger">
                Las claves no son iguales
              </div>
            )}
          </div>
          <button disabled={!areEquals || pass} className="w-100 btn btn-primary btn-lg" type="submit" onClick={handleSubmit}>
            Registrarme
          </button>
        </div>
      </form>
    </div>
  );
}

export default UserForm
