import './Campo-Formulario.estilos.css'

export function CampoFormulario({children}) {
  return(
    <fieldset className='campo-form'>
      {children}
    </fieldset>
  )
  
}