import "./Formulario-Evento.estilos.css";
import { CampoEntrada } from "../CampoEntrada";
import { CampoFormulario } from "../CampoFormulario";
import { Label } from "../Label";
import { TituloFormulario } from "../TituloFormulario";
import { Botao } from "../Botao";
import { ListaSuspensa } from "../ListaSuspensa";

export function FomularioEvento({ temas, aoSubmeter }) {
  function aoFormSubmetido(formData) {
    console.log("criar evento", formData);
    const evento = {
      capa: formData.get("capa"),
      tema: temas.find(function (item) {
        return item.id == formData.get("tema");
      }),
      data: new Date(formData.get("dataEvento")),
      titulo: formData.get("nomeEvento"),
    };
    aoSubmeter(evento);
  }

  return (
    <form className="form-evento" action = {aoFormSubmetido}>
      <TituloFormulario>Preencha para criar um evento:</TituloFormulario>
      <div className="campos">
        <CampoFormulario>
          <Label htmlFor="nomeEvento">Qual é o nome do evento?</Label>
          <CampoEntrada
            type="text"
            id="nomeEvento"
            name="nomeEvento"
            placeholder="Summer dev hits"
          />
        </CampoFormulario>
        <CampoFormulario>
          <Label htmlFor="capa">Qual o endereço da imagem de capa?</Label>
          <CampoEntrada
            type="text"
            id="capa"
            name="capa"
            placeholder="http://..."
          />
        </CampoFormulario>
        <CampoFormulario>
          <Label htmlFor="dataEvento">Data do evento</Label>
          <CampoEntrada
            type="date"
            id="dataEvento"
            name="dataEvento"
            placeholder="Summer dev hits"
          />
        </CampoFormulario>
        <CampoFormulario>
          <Label htmlFor="tema">Tema do evento</Label>
          <ListaSuspensa name="tema" id="tema" itens={temas} />
        </CampoFormulario>
      </div>
      <div className="acoes">
        <Botao>Cirar Evento</Botao>
      </div>
    </form>
  );
}
