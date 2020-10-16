import { createElement } from "react";
import { Sparklines, SparklinesLine } from 'react-sparklines-typescript';

interface SparklineCompProps {
    color: string;
    data: number[];
}

const SparklineComp : React.FC<SparklineCompProps> = ({color,data}) => {
    return (
        <Sparklines data={data}>
            <SparklinesLine color={color}/>
        </Sparklines>
    );
};

export default SparklineComp;