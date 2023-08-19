const FunctionalComp = () => {
  const titulo = "Soy un título";
  const parrafo = "soy un párrafo"
  return (
    <div>
      <h1>{titulo}</h1>
      <p>{parrafo}</p>
      <img src="../../public/logo negativo.png" alt="" width={45}/>
    </div>
  );
};

export default FunctionalComp;