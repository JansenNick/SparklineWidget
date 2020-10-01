import { Component, ReactNode, createElement } from "react";
import { SparklineComp } from "./components/SparklineComp";

import { SparklineWidgetContainerProps } from "../typings/SparklineWidgetProps";

import "./ui/SparklineWidget.css";

export default class SparklineWidget extends Component<SparklineWidgetContainerProps> {
    render(): ReactNode {
        let data: number[]= [];       
        this.props.number1 ? data.push(parseInt(this.props.number1.displayValue)): "0";
        this.props.number2 ? data.push(parseInt(this.props.number2.displayValue)): "0";
        this.props.number3 ? data.push(parseInt(this.props.number3.displayValue)): "0";
        this.props.number4 ? data.push(parseInt(this.props.number4.displayValue)): "0";
        this.props.number5 ? data.push(parseInt(this.props.number5.displayValue)): "0";
        this.props.number6 ? data.push(parseInt(this.props.number6.displayValue)): "0";
        this.props.number7 ? data.push(parseInt(this.props.number7.displayValue)): "0";
        this.props.number8 ? data.push(parseInt(this.props.number8.displayValue)): "0";
        this.props.number9 ? data.push(parseInt(this.props.number9.displayValue)): "0";
        this.props.number10 ? data.push(parseInt(this.props.number10.displayValue)): "0";
        this.props.number11 ? data.push(parseInt(this.props.number11.displayValue)): "0";
        this.props.number12 ? data.push(parseInt(this.props.number12.displayValue)): "0";
        this.props.number13 ? data.push(parseInt(this.props.number13.displayValue)): "0";
        this.props.number14 ? data.push(parseInt(this.props.number14.displayValue)): "0";
        this.props.number15 ? data.push(parseInt(this.props.number15.displayValue)): "0";
        this.props.number16 ? data.push(parseInt(this.props.number16.displayValue)): "0";
        this.props.number17 ? data.push(parseInt(this.props.number17.displayValue)): "0";
        this.props.number18 ? data.push(parseInt(this.props.number18.displayValue)): "0";
        this.props.number19 ? data.push(parseInt(this.props.number19.displayValue)): "0";
        this.props.number20 ? data.push(parseInt(this.props.number20.displayValue)): "0";
        return (
            
        <SparklineComp
            color={this.props.color}
            data={data}
        ></SparklineComp>
        );
    }
}