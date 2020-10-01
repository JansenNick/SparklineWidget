import { Component, ReactNode, createElement } from "react";
import { Sparklines, SparklinesLine } from 'react-sparklines-typescript';

export interface SparklineCompProps {
    color: string;
    data: number[];
}

export class SparklineComp extends Component<SparklineCompProps> {
    render(): ReactNode {
        return <Sparklines data={this.props.data}>
            <SparklinesLine color={this.props.color}/>
      </Sparklines>
    }
}
