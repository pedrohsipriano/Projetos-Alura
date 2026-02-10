const html = document.querySelector('html')
const focoBt = document.querySelector('.app__card-button--foco')
const curtoBt = document.querySelector('.app__card-button--curto')
const longoBt = document.querySelector('.app__card-button--longo')
const banner = document.querySelector('.app__image')
const titulo = document.querySelector('.app__title')
const botoes = document.querySelectorAll('.app__card-button')
const startPauseBt = document.getElementById('start-pause')
const iniciarOuPausarBt = document.querySelector('#start-pause span')
const playBt = document.querySelector('.app__card-primary-butto-icon')

const tempoNaTela = document.getElementById('timer')

const musicaFocoInput = document.getElementById('alternar-musica')
const musica = new Audio('/sons/luna-rise-part-one.mp3')
const beep = new Audio('/sons/beep.mp3')
const pause = new Audio('/sons/pause.mp3')
const play = new Audio('/sons/play.wav')

musica.loop = true

let tempoDecorridoEmSegundos = 5
let intervaloId = null

musicaFocoInput.addEventListener('change', () => {
    if (musica.paused) {
        musica.play()
    } else {
        musica.pause()
    }
})

focoBt.addEventListener('click', () => {
    tempoDecorridoEmSegundos = 5
    alterarContexto('foco')
    focoBt.classList.add('active')
})

curtoBt.addEventListener('click', () => {
    tempoDecorridoEmSegundos = 5
    alterarContexto('descanso-curto')
    curtoBt.classList.add('active')
})

longoBt.addEventListener('click', () => {
    tempoDecorridoEmSegundos = 5
    alterarContexto('descanso-longo')
    longoBt.classList.add('active')
})


function alterarContexto(contexto) {
    mostrarTempo()
    botoes.forEach(function (contexto) {
        contexto.classList.remove('active')
    })
    html.setAttribute('data-contexto', contexto)
    banner.setAttribute('src', `/imagens/${contexto}.png`)

    switch (contexto) {
        case 'foco':
            titulo.innerHTML = `
                Otimize sua produtividade,<br>
                <strong class='app__title-strong'>mergulhe no que importa.</strong>
            `
            break
        case 'descanso-curto':
            titulo.innerHTML = `
            Que tal dar uma respiada.<br>
                <strong class='app__title-strong'>Faça uma pausa curta.</strong>
            `
            break
        case 'descanso-longo':
            titulo.innerHTML = `
            Hora de voltar à superfice.<br>
                <strong class='app__title-strong'>Faça uma pausalonga.</strong>
            `
            break
        default:
            break
    }
}

const contagemRegressiva = () => {
    tempoDecorridoEmSegundos -= 1
    mostrarTempo()
    if (tempoDecorridoEmSegundos <= 0) {
        beep.play()
        alert('Tempo finalizado!')
        const focoAtivo = html.getAttribute('data-contexto') == 'foco'
        if (focoAtivo) {
            const evento = new CustomEvent('focoFinalizado')
            document.dispatchEvent(evento)
        }
        zerar()
        return
    }
}

startPauseBt.addEventListener('click', iniciarOuPausar)

function iniciarOuPausar() {
    if (intervaloId) {
        pause.play()
        zerar()
        return
    }
    intervaloId = setInterval(contagemRegressiva, 1000)
    play.play()
    iniciarOuPausarBt.textContent = 'Pausar'
    playBt.setAttribute('src', '/imagens/pause.png')
}

function zerar() {
    clearInterval(intervaloId)
    intervaloId = null
    iniciarOuPausarBt.textContent = 'Começar'
    playBt.setAttribute('src', '/imagens/play_arrow.png')
}

function mostrarTempo() {
    const tempo = new Date(tempoDecorridoEmSegundos * 1000)
    const tempoFormatado = tempo.toLocaleTimeString('pt-Br', {minute: '2-digit', second: '2-digit'})
    tempoNaTela.innerHTML = `${tempoFormatado}`
}

mostrarTempo()