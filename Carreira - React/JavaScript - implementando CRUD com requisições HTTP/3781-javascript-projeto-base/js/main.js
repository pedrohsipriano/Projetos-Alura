import ui from "./ui.js"
import api from "./api.js"

document.addEventListener('DOMContentLoaded', () => {
    ui.renderizarPensamentos()

    const formularioPensamento = document.querySelector('#pensamento-form')
    formularioPensamento.addEventListener('submit', manipularSubmicaoFormulario)

    const btnCancelar = document.querySelector('#botao-cancelar')
    btnCancelar.addEventListener('click', manupularCancelamento)
})

async function manipularSubmicaoFormulario(event) {
    event.preventDefault();
    const id = document.getElementById('pensamento-id').value
    const conteudo = document.getElementById('pensamento-conteudo').value
    const autoria = document.getElementById('pensamento-autoria').value

    try {
        if (id) {
            await api.editarPensamento({ id, conteudo, autoria })
        } else {
            await api.salvarPensamento({ conteudo, autoria })
        }
        ui.renderizarPensamentos()
    } catch {
        alert('Erro ao salvar pensamento')
    }
}

function manupularCancelamento() {
    ui.limparFormulario()
}