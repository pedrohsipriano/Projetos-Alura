import "./empty-state.style.css";

export function EmptyState() {
  return (
    <section className="empty-state">
      <p>Ainda não tem tarefas cadastradas, adicione para começar!</p>
      <img
        src="./empty-stateempty-content-page-state-260nw-2298942113.png"
        alt=""
      />
    </section>
  );
}
