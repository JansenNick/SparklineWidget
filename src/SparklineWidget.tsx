import { createElement } from "react";
import SparklineComp from "./components/SparklineComp"
import { SparklineWidgetContainerProps } from "../typings/SparklineWidgetProps";
import "./ui/SparklineWidget.css";

const SparklineWidget : React.FC<SparklineWidgetContainerProps> = ({color, sparklineData}) => {
    let data: number[]= [];       
    for(const datapoint of sparklineData){
       datapoint.number ?  data.push(parseInt(datapoint.number.displayValue)): "0";
    }
    return (
        <SparklineComp color={color} data={data}></SparklineComp>
    );
};

export default SparklineWidget;